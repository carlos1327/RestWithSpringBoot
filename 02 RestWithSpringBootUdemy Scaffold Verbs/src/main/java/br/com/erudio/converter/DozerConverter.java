package br.com.erudio.converter;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerConverter {

	private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();
	
	public static <O, D>  D parseObject(O origin, Class<D> destination) {
		return mapper.map(origin, destination);
	}
	
	public static <O, D>  List<D> parseListObjects(List<O> origin, Class<D> destination) {
		List<D> listDestination = new ArrayList<>();
		for (Object o : origin) {
			listDestination.add(mapper.map(o, destination));
		}
		return listDestination;
	}
	
	
}
