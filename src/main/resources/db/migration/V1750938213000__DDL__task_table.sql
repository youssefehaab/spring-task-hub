CREATE SCHEMA IF NOT EXISTS tasks_schema;

CREATE TABLE tasks_schema.tasks
(
  id          uuid PRIMARY KEY,
  title       text NOT NULL,
  description text NOT NULL,
  status      text NOT NULL,
  assigned_to text NOT NULL,
  due_date    text NOT NULL,
  created_at  TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT ( CURRENT_TIMESTAMP AT TIME ZONE 'UTC' ),
  updated_at  TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT ( CURRENT_TIMESTAMP AT TIME ZONE 'UTC' )
)