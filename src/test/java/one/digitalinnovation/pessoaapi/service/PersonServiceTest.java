package one.digitalinnovation.pessoaapi.service;

import one.digitalinnovation.pessoaapi.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGiverPersonDTOThenReturnSavedMessage() {
//        PersonDTO personDTO = createFakeDTO();
//        Person expectedSavedPerson = createFakeEntity();
//
//        when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);
//
//        MessageResponseDTO expectedSuccessMessagem
    }
}
