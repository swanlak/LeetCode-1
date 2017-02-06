--Solution (MySQL)

select result.recipient from (
		select  t.sender,
		        t.recipient,
		        t.date,
		        t.amount,
		        if(@rcp = t.recipient, @rownum:=@rownum+1, @rownum:=1) as r,
		        @rcp:=t.recipient
            from (
                  select *
                  from transfers
                  order by amount desc
                ) t,
    (select @rownum := 0) a
		order by t.recipient desc, t.amount desc
  ) result
where result.r <= 3
group by recipient
having sum(result.amount) >= 1024;