package com.annotations.repeatableannotation_05;

import java.lang.annotation.*;

// Defining the repeatable annotation @BugReport
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
public @interface BugReport {
	String description();
}
