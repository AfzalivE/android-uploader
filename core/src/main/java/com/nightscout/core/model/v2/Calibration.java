// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: core/src/main/java/com/nightscout/core/model/v2/g4_data.proto
package com.nightscout.core.model.v2;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.DOUBLE;
import static com.squareup.wire.Message.Label.REQUIRED;

/**
 * Next tag: 6
 */
public final class Calibration extends Message {
  private static final long serialVersionUID = 0L;

  public static final Double DEFAULT_SLOPE = 0D;
  public static final Double DEFAULT_INTERCEPT = 0D;
  public static final Double DEFAULT_SCALE = 0D;
  public static final Double DEFAULT_DECAY = 0D;

  @ProtoField(tag = 1, type = DOUBLE, label = REQUIRED)
  public final Double slope;

  @ProtoField(tag = 2, type = DOUBLE)
  public final Double intercept;

  @ProtoField(tag = 3, type = DOUBLE)
  public final Double scale;

  @ProtoField(tag = 4, type = DOUBLE)
  public final Double decay;

  @ProtoField(tag = 5)
  public final G4Timestamp timestamp;

  public Calibration(Double slope, Double intercept, Double scale, Double decay, G4Timestamp timestamp) {
    this.slope = slope;
    this.intercept = intercept;
    this.scale = scale;
    this.decay = decay;
    this.timestamp = timestamp;
  }

  private Calibration(Builder builder) {
    this(builder.slope, builder.intercept, builder.scale, builder.decay, builder.timestamp);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Calibration)) return false;
    Calibration o = (Calibration) other;
    return equals(slope, o.slope)
        && equals(intercept, o.intercept)
        && equals(scale, o.scale)
        && equals(decay, o.decay)
        && equals(timestamp, o.timestamp);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = slope != null ? slope.hashCode() : 0;
      result = result * 37 + (intercept != null ? intercept.hashCode() : 0);
      result = result * 37 + (scale != null ? scale.hashCode() : 0);
      result = result * 37 + (decay != null ? decay.hashCode() : 0);
      result = result * 37 + (timestamp != null ? timestamp.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Calibration> {

    public Double slope;
    public Double intercept;
    public Double scale;
    public Double decay;
    public G4Timestamp timestamp;

    public Builder() {
    }

    public Builder(Calibration message) {
      super(message);
      if (message == null) return;
      this.slope = message.slope;
      this.intercept = message.intercept;
      this.scale = message.scale;
      this.decay = message.decay;
      this.timestamp = message.timestamp;
    }

    public Builder slope(Double slope) {
      this.slope = slope;
      return this;
    }

    public Builder intercept(Double intercept) {
      this.intercept = intercept;
      return this;
    }

    public Builder scale(Double scale) {
      this.scale = scale;
      return this;
    }

    public Builder decay(Double decay) {
      this.decay = decay;
      return this;
    }

    public Builder timestamp(G4Timestamp timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    @Override
    public Calibration build() {
      checkRequiredFields();
      return new Calibration(this);
    }
  }
}