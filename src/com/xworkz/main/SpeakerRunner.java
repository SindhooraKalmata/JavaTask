package com.xworkz.main;

import com.xworkz.external.Speaker;
import com.xworkz.internal.Bluetooth;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker speaker=new Speaker();
        speaker.price();
        speaker.pieces();
        speaker.type();
        speaker.warranty();
        speaker.brand();

        Speaker speaker1=new Bluetooth();
        speaker1.brand();
        speaker1.type();
        speaker1.pieces();
        speaker1.price();
        speaker1.warranty();

        Speaker speaker2=new Bluetooth();
        speaker2.brand();
        speaker2.type();
        speaker2.pieces();
        speaker2.price();
        speaker2.warranty();

        Speaker speaker3=new Bluetooth();
        speaker3.brand();
        speaker3.type();
        speaker3.pieces();
        speaker3.price();
        speaker3.warranty();
    }
}
