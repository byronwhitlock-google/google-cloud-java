// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/histogram.proto

package com.google.cloud.talent.v4beta1;

public interface HistogramQueryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.HistogramQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An expression specifies a histogram request against matching resources
   * (for example, jobs, profiles) for searches.
   * See [SearchJobsRequest.histogram_queries][google.cloud.talent.v4beta1.SearchJobsRequest.histogram_queries] and
   * [SearchProfilesRequest.histogram_queries][google.cloud.talent.v4beta1.SearchProfilesRequest.histogram_queries] for details about syntax.
   * </pre>
   *
   * <code>string histogram_query = 1;</code>
   */
  java.lang.String getHistogramQuery();
  /**
   *
   *
   * <pre>
   * An expression specifies a histogram request against matching resources
   * (for example, jobs, profiles) for searches.
   * See [SearchJobsRequest.histogram_queries][google.cloud.talent.v4beta1.SearchJobsRequest.histogram_queries] and
   * [SearchProfilesRequest.histogram_queries][google.cloud.talent.v4beta1.SearchProfilesRequest.histogram_queries] for details about syntax.
   * </pre>
   *
   * <code>string histogram_query = 1;</code>
   */
  com.google.protobuf.ByteString getHistogramQueryBytes();
}
