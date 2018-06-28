package com.springmvc.file;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/27
 * Time: 11:06
 */
@Controller
public class UploadController {
   /* @RequestMapping(value="/toUpload")
    public String toUpload(){
        return "upload";
    }*/
    @RequestMapping(value = "/upload",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String upload(@RequestParam("flie") MultipartFile flie){
        try {
            FileUtils.writeByteArrayToFile(new File("E:\\file\\upload\\"+flie.getOriginalFilename()),flie.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }
        return "上传成功！";

    }
}
