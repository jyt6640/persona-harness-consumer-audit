# Blackbear Architecture Plan

Role: `blackbear`
Status: accepted
## Inputs

Requirements source: `README.md`
README status: missing

Project profile summary:
- user-language: ko
- project-context: solo
- project-goal: production-service
- project-scale: small
- application-type: rest-api
- storage: database
- persistence-technology: jdbc-template
- migration-style: flyway
- package-style: domain-first
- architecture-style: clean-architecture-light
- boundary-strictness: strict
- notes.project: Default backend profile created by Persona Harness.

Project profile usage principles:
- Use this summary as architecture/technology planning context before implementation.
- The user's README, requirements, and explicit instructions take precedence.
- This summary is not rule enforcement or a product-quality guarantee.

## Project Mode

Mode: existing-code

- Existing source files detected: 3
- Existing package root: com.example.shop
- Existing layer/style hints: none detected
- existing code wins over greenfield guidance: follow current package, naming, layer, repository, DTO, and domain style before introducing the baseline structure.
- If current code conflicts with profile guidance, record the conflict in this plan before implementation.

## Architecture / Technology Plan

- [ ] 요구사항의 핵심 유스케이스를 README 기준으로 정리한다.
- [ ] Java/Spring Gradle 기준의 기술 선택을 명시한다.
- [ ] package/layer 구조를 정한다.
- [ ] storage/persistence 선택과 repository boundary를 정한다.
- [ ] DTO boundary와 domain behavior 기준을 정한다.

## Non-Goals

- rule enforcement가 아니다.
- generated app product-quality 보증이 아니다.
- frontend/infra workflow가 아니다.
- TDD workflow 강제가 아니다.
- autonomous subagent 실행이 아니다.

## Acceptance

- implementation must not start until this plan is reviewed or accepted.
- 긴 README나 plan은 한 번에 읽었다고 가정하지 않는다.
- Read tool 출력이 잘리면 OS별로 안전한 `npx ph bearshell` line range를 나눠 끝까지 읽는다.
- macOS/Linux: `npx ph bearshell --shell 'sed -n "1,220p" README.md'`.
- Windows PowerShell: `npx ph bearshell powershell -NoProfile -Command "Get-Content README.md -TotalCount 220"`.
- Windows search는 `npx ph bearshell powershell -NoProfile -Command "Select-String -Path README.md -Pattern TODO"` 형태를 사용한다.
- Windows search scope: do not recurse project root or .persona root; search README.md or owned source roots only to avoid node_modules/package vendor matches.
- 구현 후에는 Gradle test/build와 manual QA evidence를 별도 report에 남긴다.
- 명령 실행이 필요하면 raw shell보다 `npx ph bearshell`을 우선 사용한다.
