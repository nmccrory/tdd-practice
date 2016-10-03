/**
 * Created by Nick on 10/2/16.
 */

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
//import static org.hamcrest.core.CombinableMatcher.both;
//import static org.hamcrest.core.StringContains.containsString;

public class PluralizerTest {

    @Test
    public void shouldAddSWhenWordIsNormal() {

        // Arrange our objects
        Pluralizer pluralizer = new Pluralizer();

        // Action we are testing
        String result = pluralizer.pluralize("Cat");
        String pluralresult = "Cats";

        // Assert that the action caused the expected result
        assertThat (result, is(pluralresult));
    }
}
