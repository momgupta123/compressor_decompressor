/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_decom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author Roshan
 */
public class compreser {
    public static void method(File file) throws IOException{
        String fileDirectory=file.getParent();
       FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/CompressedFile.gz");
        GZIPOutputStream gzip=new GZIPOutputStream(out:fos);
        byte[] buffer=new byte[1024];
        int len;
        while((len=fis.read(b:buffer))!=-1){
        gzip.write(buf:buffer,off:0,len);
    }
        gzip.close();
        fos.close();
        fis.close();
   }
    public static void main(String[] args) throws IOException
    {
        String pathname;
        File path=new File(pathname:"/Users/Roushan/Doenloads/Compressor/compressordecompressor//CompressedFile.gz");
        method(file:path);
      
    }
            }
