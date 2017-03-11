package org.yourcart.utilize;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.servlet.http.Part;

/**
 * Make an operation on file & get info
 *
 * @author MotYim
 */
public class FileUpload {

    /**
     * upload image to server
     *
     * @param file
     * @param path
     * @return path where file saved on server
     */
    public static String uploadImage(Part file, String path) {
        try {

            if (!isImage(file)) {
                throw new RuntimeException("not an image");
            }

            path += "/upload/";
            String fileName = getFileName(file);
            file.write(path + fileName);
            return "upload/" + fileName;

        } catch (IOException ex) {
            ex.printStackTrace();
            return "";
        }
    }
<<<<<<< HEAD
    
   public static boolean deleteFile (String photo,String path){
        
       if (photo.equalsIgnoreCase("upload/yourCart.png")||photo.equalsIgnoreCase("upload/profile.jpg"))
               {
                   return true;
               }
        File file =new File(path+photo);
        System.out.println("OoOoo---->"+path+photo);
                if (file.exists())
        {
        boolean delete = file.delete();
        System.out.println("file is deleted"+delete);
        return true;
        }
        return false;
    }
=======

    /**
     * get file name of part
     *
     * @param part
     * @return file name
     */
>>>>>>> e0454714ccfc8acc2c0a99e4e7b55a232946658b
    private static String getFileName(final Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {

                return new Date().getTime() + content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

    /**
     * check if file is an image
     *
     * @param part
     * @return true if file is image <br/>
     * false if file not image
     */
    private static boolean isImage(final Part part) {
        String type = part.getContentType();
        return type.contains("image");
    }

    public static boolean deleteFile(String photo, String path) {

        if (photo.equalsIgnoreCase("upload/yourCart.png") || photo.equalsIgnoreCase("upload/profile.jpg")) {
            return true;
        }
        File file = new File(path + photo);

        if (file.exists()) {
            boolean delete = file.delete();

            return true;
        }
        return false;
    }
}
