package com.NayckulB.abrasive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class WebControllerTest {

    @Test
    void testIndex() {
        WebController controller = new WebController();
        String viewName = controller.index();
        assertEquals("program", viewName);
    }
}