// automatically generated by the FlatBuffers compiler, do not modify

package Game.model;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class GameStateT {
  private short[] field;
  private boolean won;
  private int[] steps;
  private int maxSteps;
  private int width;
  private int height;
  private Game.model.ScoreT[] scores;

  public short[] getField() { return field; }

  public void setField(short[] field) { this.field = field; }

  public boolean getWon() { return won; }

  public void setWon(boolean won) { this.won = won; }

  public int[] getSteps() { return steps; }

  public void setSteps(int[] steps) { this.steps = steps; }

  public int getMaxSteps() { return maxSteps; }

  public void setMaxSteps(int maxSteps) { this.maxSteps = maxSteps; }

  public int getWidth() { return width; }

  public void setWidth(int width) { this.width = width; }

  public int getHeight() { return height; }

  public void setHeight(int height) { this.height = height; }

  public Game.model.ScoreT[] getScores() { return scores; }

  public void setScores(Game.model.ScoreT[] scores) { this.scores = scores; }


  public GameStateT() {
    this.field = null;
    this.won = false;
    this.steps = null;
    this.maxSteps = 0;
    this.width = 0;
    this.height = 0;
    this.scores = null;
  }
  public static GameStateT deserializeFromBinary(byte[] fbBuffer) {
    return GameState.getRootAsGameState(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    GameState.finishGameStateBuffer(fbb, GameState.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

