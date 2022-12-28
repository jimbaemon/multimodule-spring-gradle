# 멀티 모듈 Sample

<img alt="npm" src="https://img.shields.io/badge/spring boot-2.7.7-brightgreen">
<img alt="npm" src="https://img.shields.io/badge/Gradle-6.8-brightgreen">

## 설명

[멀티모듈 설계 이야기 with Spring, Gradle](https://techblog.woowahan.com/2637/) 의 글을 읽고 참조하여 구성해본 멀티모듈 예제
입니다.

의존성 최소화를 위해 각 모듈별 의존을 최소화 하려고 하였습니다.

독립 모듈 계층은 편하게 구성해서 사용하면 될것 같아서 예제에서 제외하였고, in system available 에 대한 이해도가 낮아서 예제에서 제외하였습니다.

최상단 build.gradle 에서 모든 의존을 관리하도록 하였으나 계측별 세부 의존성 관리를 위해서는 모듈별로 따로 구성하는게 좋을듯 합니다.