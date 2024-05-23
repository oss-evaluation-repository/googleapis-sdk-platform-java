/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/postal_address.proto

// Protobuf Java Version: 3.25.3
package com.google.type;

public interface PostalAddressOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.type.PostalAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The schema revision of the `PostalAddress`. This must be set to 0, which is
   * the latest revision.
   *
   * All new revisions **must** be backward compatible with old revisions.
   * </pre>
   *
   * <code>int32 revision = 1;</code>
   *
   * @return The revision.
   */
  int getRevision();

  /**
   *
   *
   * <pre>
   * Required. CLDR region code of the country/region of the address. This
   * is never inferred and it is up to the user to ensure the value is
   * correct. See http://cldr.unicode.org/ and
   * http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html
   * for details. Example: "CH" for Switzerland.
   * </pre>
   *
   * <code>string region_code = 2;</code>
   *
   * @return The regionCode.
   */
  java.lang.String getRegionCode();
  /**
   *
   *
   * <pre>
   * Required. CLDR region code of the country/region of the address. This
   * is never inferred and it is up to the user to ensure the value is
   * correct. See http://cldr.unicode.org/ and
   * http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html
   * for details. Example: "CH" for Switzerland.
   * </pre>
   *
   * <code>string region_code = 2;</code>
   *
   * @return The bytes for regionCode.
   */
  com.google.protobuf.ByteString getRegionCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. BCP-47 language code of the contents of this address (if
   * known). This is often the UI language of the input form or is expected
   * to match one of the languages used in the address' country/region, or their
   * transliterated equivalents.
   * This can affect formatting in certain countries, but is not critical
   * to the correctness of the data and will never affect any validation or
   * other non-formatting related operations.
   *
   * If this value is not known, it should be omitted (rather than specifying a
   * possibly incorrect default).
   *
   * Examples: "zh-Hant", "ja", "ja-Latn", "en".
   * </pre>
   *
   * <code>string language_code = 3;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. BCP-47 language code of the contents of this address (if
   * known). This is often the UI language of the input form or is expected
   * to match one of the languages used in the address' country/region, or their
   * transliterated equivalents.
   * This can affect formatting in certain countries, but is not critical
   * to the correctness of the data and will never affect any validation or
   * other non-formatting related operations.
   *
   * If this value is not known, it should be omitted (rather than specifying a
   * possibly incorrect default).
   *
   * Examples: "zh-Hant", "ja", "ja-Latn", "en".
   * </pre>
   *
   * <code>string language_code = 3;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Postal code of the address. Not all countries use or require
   * postal codes to be present, but where they are used, they may trigger
   * additional validation with other parts of the address (e.g. state/zip
   * validation in the U.S.A.).
   * </pre>
   *
   * <code>string postal_code = 4;</code>
   *
   * @return The postalCode.
   */
  java.lang.String getPostalCode();
  /**
   *
   *
   * <pre>
   * Optional. Postal code of the address. Not all countries use or require
   * postal codes to be present, but where they are used, they may trigger
   * additional validation with other parts of the address (e.g. state/zip
   * validation in the U.S.A.).
   * </pre>
   *
   * <code>string postal_code = 4;</code>
   *
   * @return The bytes for postalCode.
   */
  com.google.protobuf.ByteString getPostalCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Additional, country-specific, sorting code. This is not used
   * in most regions. Where it is used, the value is either a string like
   * "CEDEX", optionally followed by a number (e.g. "CEDEX 7"), or just a number
   * alone, representing the "sector code" (Jamaica), "delivery area indicator"
   * (Malawi) or "post office indicator" (e.g. Côte d'Ivoire).
   * </pre>
   *
   * <code>string sorting_code = 5;</code>
   *
   * @return The sortingCode.
   */
  java.lang.String getSortingCode();
  /**
   *
   *
   * <pre>
   * Optional. Additional, country-specific, sorting code. This is not used
   * in most regions. Where it is used, the value is either a string like
   * "CEDEX", optionally followed by a number (e.g. "CEDEX 7"), or just a number
   * alone, representing the "sector code" (Jamaica), "delivery area indicator"
   * (Malawi) or "post office indicator" (e.g. Côte d'Ivoire).
   * </pre>
   *
   * <code>string sorting_code = 5;</code>
   *
   * @return The bytes for sortingCode.
   */
  com.google.protobuf.ByteString getSortingCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Highest administrative subdivision which is used for postal
   * addresses of a country or region.
   * For example, this can be a state, a province, an oblast, or a prefecture.
   * Specifically, for Spain this is the province and not the autonomous
   * community (e.g. "Barcelona" and not "Catalonia").
   * Many countries don't use an administrative area in postal addresses. E.g.
   * in Switzerland this should be left unpopulated.
   * </pre>
   *
   * <code>string administrative_area = 6;</code>
   *
   * @return The administrativeArea.
   */
  java.lang.String getAdministrativeArea();
  /**
   *
   *
   * <pre>
   * Optional. Highest administrative subdivision which is used for postal
   * addresses of a country or region.
   * For example, this can be a state, a province, an oblast, or a prefecture.
   * Specifically, for Spain this is the province and not the autonomous
   * community (e.g. "Barcelona" and not "Catalonia").
   * Many countries don't use an administrative area in postal addresses. E.g.
   * in Switzerland this should be left unpopulated.
   * </pre>
   *
   * <code>string administrative_area = 6;</code>
   *
   * @return The bytes for administrativeArea.
   */
  com.google.protobuf.ByteString getAdministrativeAreaBytes();

  /**
   *
   *
   * <pre>
   * Optional. Generally refers to the city/town portion of the address.
   * Examples: US city, IT comune, UK post town.
   * In regions of the world where localities are not well defined or do not fit
   * into this structure well, leave locality empty and use address_lines.
   * </pre>
   *
   * <code>string locality = 7;</code>
   *
   * @return The locality.
   */
  java.lang.String getLocality();
  /**
   *
   *
   * <pre>
   * Optional. Generally refers to the city/town portion of the address.
   * Examples: US city, IT comune, UK post town.
   * In regions of the world where localities are not well defined or do not fit
   * into this structure well, leave locality empty and use address_lines.
   * </pre>
   *
   * <code>string locality = 7;</code>
   *
   * @return The bytes for locality.
   */
  com.google.protobuf.ByteString getLocalityBytes();

  /**
   *
   *
   * <pre>
   * Optional. Sublocality of the address.
   * For example, this can be neighborhoods, boroughs, districts.
   * </pre>
   *
   * <code>string sublocality = 8;</code>
   *
   * @return The sublocality.
   */
  java.lang.String getSublocality();
  /**
   *
   *
   * <pre>
   * Optional. Sublocality of the address.
   * For example, this can be neighborhoods, boroughs, districts.
   * </pre>
   *
   * <code>string sublocality = 8;</code>
   *
   * @return The bytes for sublocality.
   */
  com.google.protobuf.ByteString getSublocalityBytes();

  /**
   *
   *
   * <pre>
   * Unstructured address lines describing the lower levels of an address.
   *
   * Because values in address_lines do not have type information and may
   * sometimes contain multiple values in a single field (e.g.
   * "Austin, TX"), it is important that the line order is clear. The order of
   * address lines should be "envelope order" for the country/region of the
   * address. In places where this can vary (e.g. Japan), address_language is
   * used to make it explicit (e.g. "ja" for large-to-small ordering and
   * "ja-Latn" or "en" for small-to-large). This way, the most specific line of
   * an address can be selected based on the language.
   *
   * The minimum permitted structural representation of an address consists
   * of a region_code with all remaining information placed in the
   * address_lines. It would be possible to format such an address very
   * approximately without geocoding, but no semantic reasoning could be
   * made about any of the address components until it was at least
   * partially resolved.
   *
   * Creating an address only containing a region_code and address_lines, and
   * then geocoding is the recommended way to handle completely unstructured
   * addresses (as opposed to guessing which parts of the address should be
   * localities or administrative areas).
   * </pre>
   *
   * <code>repeated string address_lines = 9;</code>
   *
   * @return A list containing the addressLines.
   */
  java.util.List<java.lang.String> getAddressLinesList();
  /**
   *
   *
   * <pre>
   * Unstructured address lines describing the lower levels of an address.
   *
   * Because values in address_lines do not have type information and may
   * sometimes contain multiple values in a single field (e.g.
   * "Austin, TX"), it is important that the line order is clear. The order of
   * address lines should be "envelope order" for the country/region of the
   * address. In places where this can vary (e.g. Japan), address_language is
   * used to make it explicit (e.g. "ja" for large-to-small ordering and
   * "ja-Latn" or "en" for small-to-large). This way, the most specific line of
   * an address can be selected based on the language.
   *
   * The minimum permitted structural representation of an address consists
   * of a region_code with all remaining information placed in the
   * address_lines. It would be possible to format such an address very
   * approximately without geocoding, but no semantic reasoning could be
   * made about any of the address components until it was at least
   * partially resolved.
   *
   * Creating an address only containing a region_code and address_lines, and
   * then geocoding is the recommended way to handle completely unstructured
   * addresses (as opposed to guessing which parts of the address should be
   * localities or administrative areas).
   * </pre>
   *
   * <code>repeated string address_lines = 9;</code>
   *
   * @return The count of addressLines.
   */
  int getAddressLinesCount();
  /**
   *
   *
   * <pre>
   * Unstructured address lines describing the lower levels of an address.
   *
   * Because values in address_lines do not have type information and may
   * sometimes contain multiple values in a single field (e.g.
   * "Austin, TX"), it is important that the line order is clear. The order of
   * address lines should be "envelope order" for the country/region of the
   * address. In places where this can vary (e.g. Japan), address_language is
   * used to make it explicit (e.g. "ja" for large-to-small ordering and
   * "ja-Latn" or "en" for small-to-large). This way, the most specific line of
   * an address can be selected based on the language.
   *
   * The minimum permitted structural representation of an address consists
   * of a region_code with all remaining information placed in the
   * address_lines. It would be possible to format such an address very
   * approximately without geocoding, but no semantic reasoning could be
   * made about any of the address components until it was at least
   * partially resolved.
   *
   * Creating an address only containing a region_code and address_lines, and
   * then geocoding is the recommended way to handle completely unstructured
   * addresses (as opposed to guessing which parts of the address should be
   * localities or administrative areas).
   * </pre>
   *
   * <code>repeated string address_lines = 9;</code>
   *
   * @param index The index of the element to return.
   * @return The addressLines at the given index.
   */
  java.lang.String getAddressLines(int index);
  /**
   *
   *
   * <pre>
   * Unstructured address lines describing the lower levels of an address.
   *
   * Because values in address_lines do not have type information and may
   * sometimes contain multiple values in a single field (e.g.
   * "Austin, TX"), it is important that the line order is clear. The order of
   * address lines should be "envelope order" for the country/region of the
   * address. In places where this can vary (e.g. Japan), address_language is
   * used to make it explicit (e.g. "ja" for large-to-small ordering and
   * "ja-Latn" or "en" for small-to-large). This way, the most specific line of
   * an address can be selected based on the language.
   *
   * The minimum permitted structural representation of an address consists
   * of a region_code with all remaining information placed in the
   * address_lines. It would be possible to format such an address very
   * approximately without geocoding, but no semantic reasoning could be
   * made about any of the address components until it was at least
   * partially resolved.
   *
   * Creating an address only containing a region_code and address_lines, and
   * then geocoding is the recommended way to handle completely unstructured
   * addresses (as opposed to guessing which parts of the address should be
   * localities or administrative areas).
   * </pre>
   *
   * <code>repeated string address_lines = 9;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the addressLines at the given index.
   */
  com.google.protobuf.ByteString getAddressLinesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The recipient at the address.
   * This field may, under certain circumstances, contain multiline information.
   * For example, it might contain "care of" information.
   * </pre>
   *
   * <code>repeated string recipients = 10;</code>
   *
   * @return A list containing the recipients.
   */
  java.util.List<java.lang.String> getRecipientsList();
  /**
   *
   *
   * <pre>
   * Optional. The recipient at the address.
   * This field may, under certain circumstances, contain multiline information.
   * For example, it might contain "care of" information.
   * </pre>
   *
   * <code>repeated string recipients = 10;</code>
   *
   * @return The count of recipients.
   */
  int getRecipientsCount();
  /**
   *
   *
   * <pre>
   * Optional. The recipient at the address.
   * This field may, under certain circumstances, contain multiline information.
   * For example, it might contain "care of" information.
   * </pre>
   *
   * <code>repeated string recipients = 10;</code>
   *
   * @param index The index of the element to return.
   * @return The recipients at the given index.
   */
  java.lang.String getRecipients(int index);
  /**
   *
   *
   * <pre>
   * Optional. The recipient at the address.
   * This field may, under certain circumstances, contain multiline information.
   * For example, it might contain "care of" information.
   * </pre>
   *
   * <code>repeated string recipients = 10;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the recipients at the given index.
   */
  com.google.protobuf.ByteString getRecipientsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The name of the organization at the address.
   * </pre>
   *
   * <code>string organization = 11;</code>
   *
   * @return The organization.
   */
  java.lang.String getOrganization();
  /**
   *
   *
   * <pre>
   * Optional. The name of the organization at the address.
   * </pre>
   *
   * <code>string organization = 11;</code>
   *
   * @return The bytes for organization.
   */
  com.google.protobuf.ByteString getOrganizationBytes();
}
