/**
 * Created by Nick on 10/3/16.
 */
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.StringContains.containsString;
public class StackTest {

    public void shouldCreateEmptyStack(){
        Stack s = new Stack();
        assertThat(s.count(), is(0));
    }

    public void shouldCreateSingleNodeStack(){
        Stack s = new Stack(6);
        assertThat(s.count(), is(1));
    }


    public void shouldReturnLastValue(){
        Stack s = new Stack(6);
        int val = s.pop();
        assertThat(6, is(val));
    }


    public void shouldPushToTopOfStack(){
        Stack s = new Stack(6);
        s.push(7);

        assertThat(s.pop(), is(7));
    }

    public void shouldGetCountWhenMultipleNodes(){
        Stack s = new Stack(6);
        s.push(7);
        s.push(8);
        s.push(9);
        assertThat(s.count(), is(4));
    }

    public void shouldReturnNextWhenPoppingOverMultipleNodes(){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        assertThat(s.pop(), is(4));
        assertThat(s.pop(), is(3));
        assertThat(s.pop(), is(2));
        assertThat(s.pop(), is(1));
    }
    @Test
    public void shouldUpdateCountWhenPopped(){
        Stack s = new Stack();
        //fill stack and get count
        s.push(1);
        s.push(7);
        s.push(3);
        s.push(8);
        assertThat(s.count(), is(4));
        //halfway exhaust stack and get count
        s.pop();
        s.pop();
        assertThat(s.count(), is(2));
        //completely exhaust stack and get count
        s.pop();
        s.pop();
        assertThat(s.count(), is(0));
    }

}
