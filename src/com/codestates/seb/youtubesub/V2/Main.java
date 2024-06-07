package com.codestates.seb.youtubesub.V2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        YoutubeSub.login();
        String str = YoutubeSub.inputString();
        YoutubeSub.printBADSTRINGLIST();
        str = YoutubeSub.changeString(str);
        YoutubeSub.printResultMessage(str);
    }
}
