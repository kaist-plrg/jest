- Class를 생성할 때 property의 생성 순서가 "length" -> "property" -> "name" 순서인데,
  다음의 테스트들은 모두 "length" -> "name" -> "property" 순서를 원함
  - language/computed-property-names/class/static/method-number.js
  - language/computed-property-names/class/static/method-string.js
  - language/computed-property-names/class/static/method-symbol.js
