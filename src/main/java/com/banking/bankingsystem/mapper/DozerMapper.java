package com.banking.bankingsystem.mapper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;



public class DozerMapper {
	
	private static ModelMapper mapper = new ModelMapper();
	
	public static <O, D> D parseObject(O origin, Class<D> destination) {
			return mapper.map(origin , destination);
	}
	
	public static <O, D> List<D> parseListObject(List<O> origin, Class<D> destination) {
		List<D> desinationObjets = new ArrayList<D>();
		for(O o: origin) {
			desinationObjets.add(mapper.map(o , destination));
		}
		return desinationObjets;
}
}
