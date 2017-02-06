package idv.carl.sample.stream;

import java.io.*;

/**
 * @author Carl Lu
 */
public class StreamSample {

    private final static String TEMP_FILE = "src/main/resources/temp";

    private static FileOutputStream fileOutputStream;
    private static BufferedOutputStream bufferedOutputStream;
    private static DataOutputStream dataOutputStream;
    private static DataInputStream dataInputStream;

    public static void main(String[] args) {
        try {
            StreamSample streamSample = new StreamSample();
            streamSample.initInputStreamComponents();
            streamSample.initOutputStreamComponents();

            dataOutputStream.writeInt(1);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.flush();
            dataOutputStream.close();

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readBoolean());

            dataInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initOutputStreamComponents() throws Exception {
        fileOutputStream = new FileOutputStream(TEMP_FILE);
        bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        dataOutputStream = new DataOutputStream(bufferedOutputStream);
    }

    private void initInputStreamComponents() throws Exception {
        dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(TEMP_FILE)));
    }

}
