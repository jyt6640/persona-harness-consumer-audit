# Persona Harness Agent Instructions

This project is initialized with Persona Harness for Java/Spring backend work.

Before implementation:
- Run `npx ph workflow implement` and follow the single AI-facing rail.
- Read `.persona/project-profile.jsonc` directly. Do not rely on Glob results for hidden `.persona` paths.
- Use the project profile as the source of truth for language, framework, build tool, storage, persistence, migration, package style, and architecture style.
- If README.md does not mention a technology stack, keep the stack from `.persona/project-profile.jsonc`.

Do not infer a Node/CommonJS project from package.json.
- package.json may exist only because Persona Harness is installed through npm.
- node_modules is dependency/vendor material, not product implementation context.

Do not read these as implementation context:
- node_modules
- .opencode/node_modules
- .persona/rules
- .persona/evidence

After implementation:
- Fill `.persona/workflow/implementation-report.md`.
- Fill `.persona/workflow/review-report.md`.
- Run `npx ph workflow finish implement` before claiming completion.
