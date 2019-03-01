package maxdifference;

import static maxdifference.MaxDifferenceCalculator.getArray;
import static maxdifference.MaxDifferenceCalculator.maxDifference;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

public class MaxDifferenceCalculatorTest {

	@Test
	public void testMaxDifference_odd() throws Exception {
		assertThat(maxDifference(new int[] { 2, 3, 10, 2, 4, 8, 1 })).isEqualTo(8);
	}

	@Test
	public void testMaxDifference_pair() throws Exception {
		assertThat(maxDifference(new int[] { 7, 9, 5, 6, 3, 2 })).isEqualTo(2);
	}

	@Test
	public void testMaxDifference_empty() throws Exception {
		assertThat(maxDifference(new int[] {})).isEqualTo(-1);
	}

	@Test
	public void testMaxDifference_one() throws Exception {
		assertThat(maxDifference(new int[] { 1 })).isEqualTo(-1);
	}

	@Test
	public void testMaxDifference_two() throws Exception {
		assertThat(maxDifference(new int[] { 9, 7 })).isEqualTo(0);
	}

	@Test
	public void testGetArray() throws Exception {
		final InputStream in0 = System.in;
		final int[] array = new int[] { 7, 2, 3, 10, 2, 4, 8, 1 };
		try (ByteArrayInputStream in = new ByteArrayInputStream(toByteArray(array))) {
			System.setIn(in);
			assertThat(getArray()).containsExactly(2, 3, 10, 2, 4, 8, 1);
		} finally {
			System.setIn(in0);
		}
	}

	private byte[] toByteArray(final int[] array) {
		return IntStream.of(array).boxed().map(Object::toString).collect(Collectors.joining("\n")).getBytes();
	}

}
