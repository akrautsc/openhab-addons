package org.openhab.binding.nina.internal.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openhab.binding.nina.internal.model.ARSCovidRulesCommonInner;
import org.openhab.binding.nina.internal.model.ARSCovidRulesLevel;
import org.openhab.binding.nina.internal.model.ARSCovidRulesRegulations;
import org.openhab.binding.nina.internal.model.ARSCovidRulesRulesInner;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ARSCovidRules  {
  
  private String key;

  private ARSCovidRulesLevel level;

  private String generalInfo;

  private List<ARSCovidRulesRulesInner> rules;

  private ARSCovidRulesRegulations regulations;

  private List<ARSCovidRulesCommonInner> common;
 /**
   * Get key
   * @return key
  **/
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ARSCovidRules key(String key) {
    this.key = key;
    return this;
  }

 /**
   * Get level
   * @return level
  **/
  @JsonProperty("level")
  public ARSCovidRulesLevel getLevel() {
    return level;
  }

  public void setLevel(ARSCovidRulesLevel level) {
    this.level = level;
  }

  public ARSCovidRules level(ARSCovidRulesLevel level) {
    this.level = level;
    return this;
  }

 /**
   * Get generalInfo
   * @return generalInfo
  **/
  @JsonProperty("generalInfo")
  public String getGeneralInfo() {
    return generalInfo;
  }

  public void setGeneralInfo(String generalInfo) {
    this.generalInfo = generalInfo;
  }

  public ARSCovidRules generalInfo(String generalInfo) {
    this.generalInfo = generalInfo;
    return this;
  }

 /**
   * Get rules
   * @return rules
  **/
  @JsonProperty("rules")
  public List<ARSCovidRulesRulesInner> getRules() {
    return rules;
  }

  public void setRules(List<ARSCovidRulesRulesInner> rules) {
    this.rules = rules;
  }

  public ARSCovidRules rules(List<ARSCovidRulesRulesInner> rules) {
    this.rules = rules;
    return this;
  }

  public ARSCovidRules addRulesItem(ARSCovidRulesRulesInner rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

 /**
   * Get regulations
   * @return regulations
  **/
  @JsonProperty("regulations")
  public ARSCovidRulesRegulations getRegulations() {
    return regulations;
  }

  public void setRegulations(ARSCovidRulesRegulations regulations) {
    this.regulations = regulations;
  }

  public ARSCovidRules regulations(ARSCovidRulesRegulations regulations) {
    this.regulations = regulations;
    return this;
  }

 /**
   * Get common
   * @return common
  **/
  @JsonProperty("common")
  public List<ARSCovidRulesCommonInner> getCommon() {
    return common;
  }

  public void setCommon(List<ARSCovidRulesCommonInner> common) {
    this.common = common;
  }

  public ARSCovidRules common(List<ARSCovidRulesCommonInner> common) {
    this.common = common;
    return this;
  }

  public ARSCovidRules addCommonItem(ARSCovidRulesCommonInner commonItem) {
    this.common.add(commonItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ARSCovidRules arSCovidRules = (ARSCovidRules) o;
    return Objects.equals(key, arSCovidRules.key) &&
        Objects.equals(level, arSCovidRules.level) &&
        Objects.equals(generalInfo, arSCovidRules.generalInfo) &&
        Objects.equals(rules, arSCovidRules.rules) &&
        Objects.equals(regulations, arSCovidRules.regulations) &&
        Objects.equals(common, arSCovidRules.common);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, level, generalInfo, rules, regulations, common);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARSCovidRules {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    generalInfo: ").append(toIndentedString(generalInfo)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    regulations: ").append(toIndentedString(regulations)).append("\n");
    sb.append("    common: ").append(toIndentedString(common)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

