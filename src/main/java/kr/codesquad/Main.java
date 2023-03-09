package kr.codesquad;

import java.util.Random;
import kr.codesquad.controller.ApplicationController;
import kr.codesquad.model.Ladder;
import kr.codesquad.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Ladder ladder = new Ladder(new Random());
        ApplicationController applicationController = new ApplicationController(view, ladder);

        applicationController.run();
    }
}
