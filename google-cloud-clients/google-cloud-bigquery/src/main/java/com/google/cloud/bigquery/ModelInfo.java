/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.api.services.bigquery.model.Model;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Strings;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 * Google BigQuery ML model information. Models are not created directly via the API, but by issuing
 * a CREATE MODEL query.
 *
 * @see <a
 *     href="https://cloud.google.com/bigquery/docs/reference/standard-sql/bigqueryml-syntax-create">CREATE
 *     MODEL statement</a>
 */
public class ModelInfo implements Serializable {

  static final Function<Model, ModelInfo> FROM_PB_FUNCTION =
      new Function<Model, ModelInfo>() {
        @Override
        public ModelInfo apply(Model pb) {
          return ModelInfo.fromPb(pb);
        }
      };
  static final Function<ModelInfo, Model> TO_PB_FUNCTION =
      new Function<ModelInfo, Model>() {
        @Override
        public Model apply(ModelInfo ModelInfo) {
          return ModelInfo.toPb();
        }
      };

  private static final long serialVersionUID = 609769793337719407L;

  private final String etag;
  private final ModelId modelId;
  private final String description;
  private final String modelType;
  private final String friendlyName;
  private final Long creationTime;
  private final Long lastModifiedTime;
  private final Long expirationTime;
  private final Labels labels;

  /** A builder for {@code ModelInfo} objects. */
  public abstract static class Builder {

    /** Sets the user description for this model. */
    public abstract Builder setDescription(String description);

    /** Sets the user-friendly name for this model. */
    public abstract Builder setFriendlyName(String friendlyName);

    /**
     * Set the time when this model expires, in milliseconds since the epoch. If not present, the
     * model persists indefinitely. Expired models will be deleted.
     */
    public abstract Builder setExpirationTime(Long expirationTime);

    /**
     * Set the labels applied to this model.
     *
     * <p>When used with {@link BigQuery#update(ModelInfo, ModelOption...)}, setting {@code labels}
     * to {@code null} removes all labels; otherwise all keys that are mapped to {@code null} values
     * are removed and other keys are updated to their respective values.
     */
    public abstract Builder setLabels(Map<String, String> labels);

    public abstract Builder setModelId(ModelId modelId);

    abstract Builder setEtag(String etag);

    abstract Builder setModelType(String modelType);

    abstract Builder setCreationTime(Long creation);

    abstract Builder setLastModifiedTime(Long lastModifiedTime);

    /** Creates a {@code ModelInfo} object. */
    public abstract ModelInfo build();
  }

  static class BuilderImpl extends Builder {

    private String etag;
    private ModelId modelId;
    private String description;
    private String modelType;
    private String friendlyName;
    private Long creationTime;
    private Long lastModifiedTime;
    private Long expirationTime;
    private Labels labels = Labels.ZERO;

    BuilderImpl() {}

    BuilderImpl(ModelInfo modelInfo) {
      this.etag = modelInfo.etag;
      this.modelId = modelInfo.modelId;
      this.description = modelInfo.description;
      this.friendlyName = modelInfo.friendlyName;
      this.modelType = modelInfo.modelType;
      this.creationTime = modelInfo.creationTime;
      this.lastModifiedTime = modelInfo.lastModifiedTime;
      this.expirationTime = modelInfo.expirationTime;
    }

    BuilderImpl(Model modelPb) {
      this.modelId = ModelId.fromPb(modelPb.getModelReference());
      if (modelPb.getLastModifiedTime() != null) {
        this.setLastModifiedTime(modelPb.getLastModifiedTime().longValue());
      }
      this.etag = modelPb.getEtag();
      this.description = modelPb.getDescription();
      this.friendlyName = modelPb.getFriendlyName();
      this.modelType = modelPb.getModelType();
      this.creationTime = modelPb.getCreationTime();
      this.lastModifiedTime = modelPb.getLastModifiedTime();
      this.expirationTime = modelPb.getExpirationTime();
      this.labels = Labels.fromPb(modelPb.getLabels());
    }

    @Override
    Builder setEtag(String etag) {
      this.etag = etag;
      return this;
    }

    @Override
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    @Override
    public Builder setFriendlyName(String friendlyName) {
      this.friendlyName = friendlyName;
      return this;
    }

    @Override
    Builder setModelType(String modelType) {
      this.modelType = modelType;
      return this;
    }

    @Override
    Builder setCreationTime(Long creationTime) {
      this.creationTime = creationTime;
      return this;
    }

    @Override
    Builder setLastModifiedTime(Long lastModifiedTime) {
      this.lastModifiedTime = lastModifiedTime;
      return this;
    }

    @Override
    public Builder setExpirationTime(Long expirationTime) {
      this.expirationTime = expirationTime;
      return this;
    }

    @Override
    public Builder setModelId(ModelId modelId) {
      this.modelId = modelId;
      return this;
    }

    @Override
    public Builder setLabels(Map<String, String> labels) {
      this.labels = Labels.fromUser(labels);
      return this;
    }

    @Override
    public ModelInfo build() {
      return new ModelInfo(this);
    }
  }

  ModelInfo(BuilderImpl builder) {
    this.modelId = checkNotNull(builder.modelId);
    this.etag = builder.etag;
    this.modelType = builder.modelType;
    this.description = builder.description;
    this.friendlyName = builder.friendlyName;
    this.creationTime = builder.creationTime;
    this.lastModifiedTime = builder.lastModifiedTime;
    this.expirationTime = builder.expirationTime;
    this.labels = builder.labels;
  }

  /** Returns the hash of the model resource. */
  public String getEtag() {
    return etag;
  }

  /** Returns the model identity. */
  public ModelId getModelId() {
    return modelId;
  }

  /** Returns the type of the ML model. */
  public String getModelType() {
    return modelType;
  }

  /** Returns the user description of the model. */
  public String getDescription() {
    return description;
  }

  /** Returns the user-friendly name for the model. */
  public String getFriendlyName() {
    return friendlyName;
  }

  /** Returns the time when this model was created, in milliseconds since the epoch. */
  public Long getCreationTime() {
    return creationTime;
  }

  /** Returns the time when this table was last modified, in milliseconds since the epoch. */
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  /**
   * Returns this this model expires, in milliseconds since the epoch. If not present, the model
   * will persist indefinitely. Expired models will be deleted.
   */
  public Long getExpirationTime() {
    return expirationTime;
  }

  /** Returns a map for labels applied to the model. */
  public Map<String, String> getLabels() {
    return labels.userMap();
  }

  public Builder toBuilder() {
    return new BuilderImpl(this);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("modelId", modelId)
        .add("etag", etag)
        .add("modelType", modelType)
        .add("description", description)
        .add("friendlyName", friendlyName)
        .add("creationTime", creationTime)
        .add("lastModifiedTime", lastModifiedTime)
        .add("expirationTime", expirationTime)
        .add("labels", labels)
        .toString();
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId);
  }

  @Override
  public boolean equals(Object obj) {
    return obj == this
        || obj != null
            && obj.getClass().equals(ModelInfo.class)
            && Objects.equals(toPb(), ((ModelInfo) obj).toPb());
  }

  /** Returns a builder for a {@code ModelInfo} object given table identity. */
  public static Builder newBuilder(ModelId modelId) {
    return new BuilderImpl().setModelId(modelId);
  }

  /** Returns a {@code ModelInfo} object given table identity. */
  public static ModelInfo of(ModelId modelId) {
    return newBuilder(modelId).build();
  }

  ModelInfo setProjectId(String projectId) {
    if (Strings.isNullOrEmpty(getModelId().getProject())) {
      return toBuilder().setModelId(getModelId().setProjectId(projectId)).build();
    }
    return this;
  }

  Model toPb() {
    Model modelPb = new Model();
    modelPb.setModelReference(modelId.toPb());
    modelPb.setEtag(etag);
    modelPb.setModelType(modelType);
    modelPb.setDescription(description);
    modelPb.setFriendlyName(friendlyName);
    modelPb.setCreationTime(creationTime);
    modelPb.setLastModifiedTime(lastModifiedTime);
    modelPb.setExpirationTime(expirationTime);
    modelPb.setLabels(labels.toPb());
    return modelPb;
  }

  static ModelInfo fromPb(Model modelPb) {
    return new BuilderImpl(modelPb).build();
  }
}
