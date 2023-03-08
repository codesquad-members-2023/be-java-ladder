package kr.codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Viewer {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String inputFromUser() throws IOException {
        return br.readLine();
    }
}
