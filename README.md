# Hackathon 25.0 - Manolo

## Summary

- Migration of expo-flow app to Vaadin 25.0.0-beta9 and Spring Boot 4.0
- Testing different starters or project generation for v25.0
- Quick Start tutorial review

### Issues and Pull Requests

| # | Type | Repository | Title | Source | URL |
|---|------|------------|-------|--------|-----|
| 1 | Issue | vaadin/flow-components | Charts DataSeries.add() throws ClassCastException | expo-flow migration | [#8334](https://github.com/vaadin/flow-components/issues/8334) |
| 2 | PR | vaadin/expo-flow | Migration to Vaadin 25 and Spring Boot 4 | expo-flow migration | [#6](https://github.com/vaadin/expo-flow/pull/6) |
| 3 | Issue | vaadin/flow | Hilla login loop with React Main Layout | start.vaadin.com | [#22905](https://github.com/vaadin/flow/issues/22905) |
| 4 | Issue | vaadin/flow | Login view not rendering with Flow Main Layout | start.vaadin.com | [#22906](https://github.com/vaadin/flow/issues/22906) |
| 5 | Issue | vaadin/docs | Quick Start tutorial - fix JAR path and clarify livereload/hotswap | Quick Start review | [#4920](https://github.com/vaadin/docs/issues/4920) |


## Migration Highlights

- Spring AI 2.0.0-SNAPSHOT (required for Spring Boot 4 compatibility)
- MCP SDK exclusions to avoid Jackson 2/3 conflicts
- Charts workaround for dynamic data updates
- JSpecify annotations replacing deprecated Spring null-safety annotations

## Quick Start Tutorial Review

**URL:** https://vaadin.com/docs/v25/getting-started/quick-start

| Step | Description | Status |
|------|-------------|--------|
| 1 | Download skeleton project | OK |
| 2 | Create MainView (Hello Vaadin) | OK |
| 3 | Run with `./mvnw` | OK |
| 4 | Add Button | OK |
| 5 | Add TextField | OK |
| 6 | Update existing Span | OK |
| 7 | Integrate ZXing QR library | OK |
| 8 | Production build | OK |

**All copy-paste code worked without modifications.**

### Documentation Issues Found

| # | Type | Description | Severity |
|---|------|-------------|----------|
| 1 | Error | Tutorial says `java -jar app-1.0-SNAPSHOT.jar` but should be `java -jar target/app-1.0-SNAPSHOT.jar` | High |
| 2 | Error | `./mvnw` has no livereload enabled, it used to be in SB 3.x: base project should come with it enabled `spring.devtools.livereload.enabled=true`, or it should be mentioned in the doc | Medium |
| 3 | Improvement | The "hotswap enabled" link only covers IDEs, not CLI. Suggest: add note why they should stop the project and re-run in IDE. | Medium |
| 4 | Improvement | Images are too large with excessive whitespace. Crop to show only significant UI elements. | Low |

