# V25-hackaton

Tested:
* Switching theme (Aura/Lumo) with `@StyleSheet` annotation.
  * Worked fine
* Hot reload of styles in META-INF/resources/styles.css 
  * Worked fine 
* Tested Signal Binding in Element
  * Worked fine 
* Tested Tailwind support 
  * Didn't work with signals `textFieldValue.getElement().bindProperty("class", signal);`

Noticed bugs: 
* Starter project with aura theme, looks a bit off. Specifically the side nav, has horizontal scrollbar. 