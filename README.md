# tensor-plat-compose-mesh

`tensor-plat-compose-mesh` explores platform engineering with a small Java codebase and local fixtures. The technical goal is to package a Java local lab for compose analysis with negative fixtures, human-readable error snapshots, and documented operating limits.

## Why I Keep It Small

The point is to make a small domain rule concrete enough that a reader can change it and immediately see what broke.

## Tensor Plat Compose Mesh Review Notes

The first comparison I would make is `route drift` against `quota pressure` because it shows where the rule is most opinionated.

## Included Behavior

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/tensor-plat-compose-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `route drift` and `quota pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Internal Model

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Java code keeps the review rule close to the tests.

## Try It Locally

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Validation

The same command runs the local verification path. The highest-scoring domain case is `edge` at 222, which lands in `ship`. The most cautious case is `stress` at 141, which lands in `ship`.

## Scope

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
