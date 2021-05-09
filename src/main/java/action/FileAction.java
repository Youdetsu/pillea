package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.*;

public class FileAction extends ActionSupport {

    private File fileUpLoad;
    private String fileUpLoadFileName;
    private InputStream inputStream;

    public String FileDown() {
        return SUCCESS;
    }

    public InputStream getInputStream() {
        try {
            return FileUtils.openInputStream(FileUtils.getFile("D:\\tmp\\",fileUpLoadFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String fileUpLoad() {


        File dest = new File("D:\\tmp\\",fileUpLoadFileName);
        try {
            FileUtils.copyFile(fileUpLoad,dest);

        } catch (IOException e) {
            e.printStackTrace();
        }


       /* System.out.println(fileUpLoadFileName);
        char[] file = new char[1024];
        try {

            FileInputStream fis = new FileInputStream(fileUpLoad);
            FileOutputStream fos = new FileOutputStream("D:\\tmp\\"+fileUpLoadFileName);
            InputStreamReader isr = new InputStreamReader(fis,"utf-8");
            OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
            int read = isr.read(file);
            while (read != -1) {
                osw.write(read);
                read = isr.read(file);
            }
            osw.close();
            isr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }*/
        return SUCCESS;
    }





    public File getFileUpLoad() {
        return fileUpLoad;
    }

    public void setFileUpLoad(File fileUpLoad) {
        this.fileUpLoad = fileUpLoad;
    }

    public String getFileUpLoadFileName() {
        return fileUpLoadFileName;
    }

    public void setFileUpLoadFileName(String fileUpLoadFileName) {
        this.fileUpLoadFileName = fileUpLoadFileName;
    }
}
