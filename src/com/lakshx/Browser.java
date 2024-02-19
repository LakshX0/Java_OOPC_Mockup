package com.lakshx;

public class Browser {
    public void navigate(String adderess) {
        String ip = findIpAddress(adderess);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<h1></h1>";
    }

    private String findIpAddress(String adderess) {
        return "127.0.0.1";
    }
}
