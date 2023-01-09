package org.example;

import javax.sound.midi.*;

public class MusicTest1 {
    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play(1, 60); //range 0 - 127
    }

    public void play(int instrument, int note) {
        try {
            //get a sequencer and open it
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            //make a new sequence
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            //get a new track from the sequence
            Track track = seq.createTrack();

            //fill the track with midi events and give de sequence to the sequencer
            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 70);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();

        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            throw new RuntimeException(e);
        }
    }
}