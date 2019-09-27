package com.rakovets.course.practice.module4;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task002Tests extends ConsoleTest {
    static Stream<Arguments> positionPlayersProvider() {
        return Stream.of(
                Arguments.of(new String[] {"13", "false"}, "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13"),
                Arguments.of(new String[] {"9", "false"}, "1\n2\n3\n4\n5\n6\n7\n8\n9"),
                Arguments.of(new String[] {"13", "true"}, "\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12"),
                Arguments.of(new String[] {"9", "true"}, "\n1\n2\n3\n4\n5\n6\n7\n8")
        );
    }

    @ParameterizedTest(name = "Position player: {0}")
    @MethodSource("positionPlayersProvider")
    @DisplayName("Position player")
    void test(String[] position, String expected) {
        Task002.main(position);
        assertEquals(getConsoleContentWithoutTrim(), expected);
    }
}