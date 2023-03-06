package kr.codesquad;

import kr.codesquad.domain.laddergenerator.LadderGenerator;
import kr.codesquad.domain.laddergenerator.StepOneLadder;
import kr.codesquad.view.InputView;
import kr.codesquad.view.OutputView;

public class AppConfig {

    public LadderGenerator ladderGenerator() {
        return new StepOneLadder();
    }

    public InputView inputView() {
        return new InputView();
    }

    public OutputView outputView() {
        return new OutputView();
    }

}
