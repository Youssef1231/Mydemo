package net;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
public class UrlCodeTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String st = URLEncoder.encode("疯狂Java", "gbk");
        System.out.println(st);
        System.out.println(URLDecoder.decode(st, "gbk"));
    }
}
