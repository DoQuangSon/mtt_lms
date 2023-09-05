/*
								* (C) 2023 - $today.date - $today.month - $today
								*/
package com.fabbi.mtt_lms.utils;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import lombok.experimental.UtilityClass;

@UtilityClass
public class EnumUtils {
    public static <V, E extends Enum<E>> E getEnum(
            V value, Class<E> type, Optional<Function<E, V>> getValueFun) {
        if (value == null) {
            return null;
        }
        return findEnum(value, type, getValueFun)
                .orElseThrow(
                        () ->
                                new IllegalArgumentException(
                                        "not found " + type + " of value " + value));
    }

    public static <V, E extends Enum<E>> Optional<E> findEnum(
            V value, Class<E> type, Optional<Function<E, V>> getValueFunc) {
        if (value == null) {
            return Optional.empty();
        }
        for (E e : type.getEnumConstants()) {
            if (getValueFunc.isPresent() && Objects.equals(value, getValueFunc.get().apply(e))) {
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }
}
