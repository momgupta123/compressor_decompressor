/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_decom;

/**
 *
 * @author Roshan
 */
public class decompre {
    public static void method(File file)throws IOException{
        String fileDirectory=file.getparent();
        FileInputStream fis=new FileInputStream(file);
        GZIPInputStream gzip=new GZIPInputStream(in:fis);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"//DeompressedFile"
        byte[] buffer=new byte[1024];
        int len;
        while((len=gzip.read(b:buffer))!=-1){
        fos.write(b:buffer,off:0,len);
    }
       gzip.close();
        fos.close();
        fis.close();
    }
     public static void main(String[] args) throws IOException
    {
        String pathname;
        File path=new File(pathname:"/Users/Roushan/Doenloads/Compressor/compressordecompressor/CompressedFile.gz");
        method(file:path);
      
    }
}