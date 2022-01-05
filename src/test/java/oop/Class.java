package oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Class {
    @Test
    public void 인스턴스의_생성과_사용() throws Exception {
        //given
        /**
         * 클래스의 인스턴스는 항상 참조변수를 통해서만 사용 가능하다.
         */
        TvTest tvTest = new TvTest();

        // when
        int channel = tvTest.channelChange(7);

        // then
        assertThat(channel).isEqualTo(7);
    }

    class TvTest {
        int channel;

        public int channelChange(int channel) {
            this.channel = channel;
            return this.channel;
        }
    }
}
