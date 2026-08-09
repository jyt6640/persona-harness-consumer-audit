# persona-harness-consumer-audit

A public Java/Spring consumer used to validate
[Persona Harness](https://github.com/jyt6640/persona-harness) Consumer Authority
Beta end to end, for
[persona-harness#116](https://github.com/jyt6640/persona-harness/issues/116).

This repository exists to be a *second* repository. The audit it supports
requires an original GitHub-signed attestation produced by a project that is not
Persona Harness itself, so nothing here is source-only or synthetic.

## What it is

A minimal Spring Boot 3.3 / Gradle 8.8 / Java 21 project with one passing test.
The application code is deliberately trivial — it exists so that the finish gate
has real Java sources, a real build, and a real test result to attest to.

`persona-harness` is installed from the npm `staging` channel, not from a local
build, so what the audit exercises is the published package.

## How the attestation is produced

`.github/workflows/project-finish.yml` calls the reusable producer workflow on
every push to `main`. The producer revision is pinned to an immutable commit
rather than a branch: the attestation binds caller and producer workflow
identities, so a moving ref would make the signed claim unverifiable.

Each push to `main` produces one signed bundle — `receipt.json`,
`predicate.json`, `bundle.json` — as a workflow artifact.

## The audited state

Tag `audited-2026-08-09` marks the commit the recorded audit ran against:

| | |
| --- | --- |
| commit | `7a44a96` |
| attestation run | `31286887961` |
| package | `persona-harness@0.8.0-beta.34` from `staging` |

`main` may have moved since. The tag is the reference the audit evidence points
at, and the workflow run keeps its artifact independently.

## What was exercised

Enrollment, fetch, finish consumption, and replay rejection, plus adversarial
inputs: malformed archives, a wrong repository id, a wrong caller workflow path,
an expired evaluation clock, a non-`main` ref, and a pull request. Results are
recorded on persona-harness#116 and persona-harness#112, including the lines
that were **not** exercised here.

## What this is not

Not a template, not a starter, and not a support claim. It is an audit fixture.
If you want to use Persona Harness, read
[the walkthrough](https://github.com/jyt6640/persona-harness/blob/main/docs/current/external-attested-finish-walkthrough.md)
instead.
