package com.rakovets.course.practice.string;

import com.rakovets.course.util.ArrayUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 * @version 1.0
 */
class Task03Tests {
	private static final String CSV_FIELD_SPLITERATOR = " ";

	@ParameterizedTest(name = "Information about stuff: {0}")
	@CsvFileSource(resources = "/string/task03-tests.csv", numLinesToSkip = 1)
	@DisplayName("Stuff: names")
	void parseToArrayNameTest(String information, String names) {
		assertArrayEquals(Task03.parseToArrayName(information), names.split(CSV_FIELD_SPLITERATOR));
	}

	@ParameterizedTest(name = "Information about stuff: {0}")
	@CsvFileSource(resources = "/string/task03-tests.csv", numLinesToSkip = 1)
	@DisplayName("Stuff: surnames")
	void parseToArraySurnameTest(String information, String names, String surnames) {
		assertArrayEquals(Task03.parseToArraySurname(information), surnames.split(CSV_FIELD_SPLITERATOR));
	}

	@ParameterizedTest(name = "Information about stuff: {0}")
	@CsvFileSource(resources = "/string/task03-tests.csv", numLinesToSkip = 1)
	@DisplayName("Stuff: salaries")
	void parseToArraySalaryTest(String information, String names, String surnames, String salaries) {
		assertArrayEquals(Task03.parseToArraySalary(information), ArrayUtil.parseToInt(salaries, CSV_FIELD_SPLITERATOR));
	}
}