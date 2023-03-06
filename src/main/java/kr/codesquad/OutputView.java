package kr.codesquad;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputView {

    private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private void globalPrintln(String output) {
        try {
            bw.write(output);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
