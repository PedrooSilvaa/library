package br.edu.senaisp.library.web.dto.mapper;

import br.edu.senaisp.library.model.Library;
import br.edu.senaisp.library.web.dto.CreateBookDto;
import br.edu.senaisp.library.web.dto.ResponseBookDto;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class BookMapper {

    public static Library toLibrary(CreateBookDto createBookDto){
        return new ModelMapper().map(createBookDto, Library.class);
    }

    public static ResponseBookDto toDto(Library library){
        ModelMapper mapper = new ModelMapper();

        return mapper.map(library, ResponseBookDto.class);
    }

    public static List<ResponseBookDto> toListDto(List<Library> libraries){
        return libraries.stream().map(lib -> toDto(lib)).collect(Collectors.toList());
    }

}
