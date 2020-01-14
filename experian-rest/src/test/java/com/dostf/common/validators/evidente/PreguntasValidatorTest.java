package com.dostf.common.validators.evidente;

import com.dostf.common.validators.evidente.PreguntasValidator;
import com.dostf.dtos.evidente.PreguntasDto;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PreguntasValidatorTest {
    private PreguntasDto preguntasDtoValid;
    private PreguntasDto preguntasDtoInValid;

    @Before
    public void setUp() {
        preguntasDtoValid = new PreguntasDto("1", "1012325270", new BigInteger("23456"));
        preguntasDtoInValid = new PreguntasDto("", "", new BigInteger("23456"));
    }

    @Test
    public void givenValidPreguntasParamsWhenValidateThenTrueWithIsInvalidMethod() {
        PreguntasValidator preguntasValidator = new PreguntasValidator();
        assertTrue(preguntasValidator.validateObject(preguntasDtoInValid).isInvalid());
    }

    @Test
    public void givenValidPreguntasParamsWhenValidateThenTrueWithIsValidMethod() {
        PreguntasValidator preguntasValidator = new PreguntasValidator();
        assertTrue(preguntasValidator.validateObject(preguntasDtoValid).isValid());
    }

}
