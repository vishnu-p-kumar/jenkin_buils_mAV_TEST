package com.bnmit;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestResultLogger implements TestWatcher {

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName = context.getDisplayName();
        System.out.println("❌ FAILED TEST: " + testName);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        String testName = context.getDisplayName();
        System.out.println("✅ PASSED TEST: " + testName);
    }
}
