package streamsj8;

import java.util.stream.Stream;

public class EmptyStream {

	public static void main(String[] args) {
		Stream<String> emptyStream = Stream.empty();
		System.out.println(emptyStream.count()); //0
	}
}
