package io.portfolio;

public final class PolicyTest {
    public static void main(String[] args) {
        var signalcase_1 = new Policy.Signal(72, 87, 16, 7, 8);
        if (Policy.score(signalcase_1) != 171) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_1).equals("accept")) throw new AssertionError("decision mismatch");
        var signalcase_2 = new Policy.Signal(72, 76, 25, 12, 5);
        if (Policy.score(signalcase_2) != 107) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_2).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_3 = new Policy.Signal(85, 73, 9, 16, 4);
        if (Policy.score(signalcase_3) != 160) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_3).equals("accept")) throw new AssertionError("decision mismatch");
    }
}
