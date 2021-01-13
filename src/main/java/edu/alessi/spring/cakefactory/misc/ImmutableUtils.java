package edu.alessi.spring.cakefactory.misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.util.CollectionUtils;

/**
 * Utility methods for building immutable, null-safe lists, sets, dates, etc
 *  
 * @author Bruno Alessi
 * @since Jan 9, 2021
 */
public final class ImmutableUtils {
	
	private ImmutableUtils() {
		//there's only static methods in this class
	}
	
	@SafeVarargs
	public static <T> List<T> immutableList(final T... items) {
		return ArrayUtils.isEmpty(items) ? Collections.emptyList() : Collections.unmodifiableList(Arrays.asList(items));
	}
	
	public static <T> List<T> immutableList(final List<T> items) {
		return CollectionUtils.isEmpty(items) ? Collections.emptyList() : Collections.unmodifiableList(items);
	}
	
	@SafeVarargs
	public static <T> Set<T> immutableSet(final T... items) {
		return ArrayUtils.isEmpty(items) ? Collections.emptySet() : Collections.unmodifiableSet(new HashSet<>(Arrays.asList(items)));
	}
	
	public static <K, V> Map<K, V> immutableMap(final Map<K, V> items) {
		return CollectionUtils.isEmpty(items) ? Collections.emptyMap() : Collections.unmodifiableMap(items);
	}
	
	public static Date immutableDate(final Date d) {
		return d == null ? new Date() : new Date(d.getTime());
	}
	
}
