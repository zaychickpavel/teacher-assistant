BEGIN;

ALTER TABLE "GROUP"
  ADD COLUMN praepostor_id INTEGER REFERENCES STUDENT (id);

COMMIT;
