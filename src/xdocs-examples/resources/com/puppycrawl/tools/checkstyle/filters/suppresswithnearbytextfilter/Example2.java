/*xml
<module name="Checker">
  <module name="SuppressWithNearbyTextFilter">
    <property name="nearbyTextPattern" value="DO NOT CHECK THIS LINE"/>
  </module>
  <module name="TreeWalker">
    <module name="MagicNumber"/>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.filters.suppresswithnearbytextfilter;
// xdoc section -- start
public class Example2 {
  int a = 42; // DO NOT CHECK THIS LINE
  int b = 43; // violation, "'43' is a magic number."
}
// xdoc section -- end
