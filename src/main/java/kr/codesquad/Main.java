package kr.codesquad;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Viewer viewer = new Viewer();

        viewer.startGame();
        viewer.printHeader();
        viewer.printLadder();
    }
}
