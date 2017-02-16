-- Solution (MySQL)
--
-- if(x, y, z)
-- -> if() will return a number or string,
--    if x is true(x != 0 && x != null), then return y, or return z
--    you can see it as: x ? y : z

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
