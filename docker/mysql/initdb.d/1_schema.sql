CREATE TABLE IF NOT EXISTS `todo_db`.`todo` (
    `id` CHAR(36) NOT NULL,
    `content` VARCHAR(100) NOT NULL,
    `done` BOOLEAN,
    `created_at` DATETIME,
    `updated_at` DATETIME,
    PRIMARY KEY(`id`)
);
