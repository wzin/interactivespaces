<#ftl strip_whitespace=true>
<?xml version="1.0"?>
<activity interactiveSpacesVersion="${project.interactiveSpacesVersionRange}">
  <name>${project.name?html}</name>
  <description>
${project.description?html}
  </description>

  <identifyingName>${project.identifyingName}</identifyingName>
  <version>${project.version}</version>

<#if project.configurationProperties?has_content>
  <configuration>
<#list project.configurationProperties as property>
    <property name="${property.name?html}" required="${property.required?string}">
      <#if property.description?has_content>
      <description>${property.description?html}</description>
      </#if>
      <#if property.value?has_content>
      <value>${property.value?html}</value>
      </#if>
    </property>
</#list>
  </configuration>
</#if>
<#if project.dependencies?has_content>
  <dependencies>
  <#list project.dependencies as dependency>
    <dependency name="${dependency.name?html}"
    <#if dependency.minimumVersion?has_content>
          minimumVersion="${dependency.minimumVersion}"
    </#if>
    <#if dependency.maximumVersion?has_content>
          maximumVersion="${dependency.maximumVersion}"
    </#if>
          required="${dependency.required?string}" />
  </#list>
  </dependencies>
</#if>
</activity>
